public class CloudStorage implements FileStorage{


    @Override
    public byte[] download(String fileName) {
        return new byte[0];
    }

    @Override
    public void delete(String fileName) {

    }

    @Override
    public void upload(String fileName, byte[] fileData) {

    }
}
