public class StorageContext {
    private FileStorage storage;

    public StorageContext(FileStorage storage){
        // Initialize the storage strategy
        this.storage = storage;
    }
    void setStorageStrategy(FileStorage storage){
        // Set the storage strategy for the context
        this.storage = storage;
    }

    void uploadFile(String fileName, byte[] fileData){
        // Use the storage strategy to upload the file
        storage.upload(fileName, fileData);
    }

    byte[] downloadFile(String fileName){
        // Use the storage strategy to download the file
        return storage.download(fileName);
    }
    void deleteFile(String fileName){
        // Use the storage strategy to delete the file
        storage.delete(fileName);
    }
}
