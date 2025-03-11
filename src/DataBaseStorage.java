public class DataBaseStorage implements FileStorage{
    @Override
    public void upload(String fileName, byte[] fileData) {

    }

    @Override
    public byte[] download(String fileName) {
        return new byte[0];
    }

    @Override
    public void delete(String fileName) {

    }
}
