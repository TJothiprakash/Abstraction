public class LocalStorageFactory
        implements AbstractStorageFactory {
    @Override
    public FileStorage createStorage() {
        return new LocalStorage();
    }
}
