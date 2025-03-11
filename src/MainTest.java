import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void testGetRespectiveFileClass() {
        assertTrue(Main.getREspectiveFileClass(StorageType.LOCAL) instanceof LocalStorage);
        assertTrue(Main.getREspectiveFileClass(StorageType.DATABASE) instanceof DataBaseStorage);
        assertTrue(Main.getREspectiveFileClass(StorageType.CLOUD) instanceof CloudStorage);
    }
}
