public interface FileStorage {

    byte[] download(String fileName);
    void delete(String fileName);

    void upload(String fileName, byte[] fileData);
}
