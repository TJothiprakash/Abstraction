public class DataBaseStorageFactory implements AbstractStorageFactory{
    @Override
    public FileStorage createStorage() {
        return new DataBaseStorage();
    }
}
