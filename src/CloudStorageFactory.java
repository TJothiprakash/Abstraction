public class CloudStorageFactory implements AbstractStorageFactory{
    @Override
    public FileStorage createStorage() {
     return new CloudStorage();
    }
}
