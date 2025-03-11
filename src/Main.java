import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StorageContext storageContext = new StorageContext(getStorageType(scanner));

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Upload File");
            System.out.println("2. Download File");
            System.out.println("3. Delete File");
            System.out.println("4. Change Storage Strategy");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter file name to upload: ");
                    String uploadFile = scanner.nextLine();
                    storageContext.uploadFile(uploadFile, "Dummy Data".getBytes());
                    break;
                case 2:
                    System.out.print("Enter file name to download: ");
                    String downloadFile = scanner.nextLine();
                    byte[] data = storageContext.downloadFile(downloadFile);
                    System.out.println(data != null ? "File content: " + new String(data) : "File not found.");
                    break;
                case 3:
                    System.out.print("Enter file name to delete: ");
                    String deleteFile = scanner.nextLine();
                    storageContext.deleteFile(deleteFile);
                    break;
                case 4:
                    storageContext.setStorageStrategy(getStorageType(scanner));
                    System.out.println("Storage strategy changed.");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static FileStorage getStorageType(Scanner scanner) {
        while (true) {
            System.out.println("\nChoose storage method:\n1. Database\n2. Local Storage\n3. Cloud Storage");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    return new DataBaseStorage();
                case 2:
                    return new LocalStorage();
                case 3:
                    return new CloudStorage();
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
