package top.chengdonglu.mall210.db;

import org.junit.Test;
import top.chengdonglu.mall210.db.util.DbUtil;

import java.io.File;

public class DbUtilTest {
    @Test
    public void testBackup() {
        File file = new File("test.sql");
        DbUtil.backup(file, "chengdonglu210mall", "chengdonglu210mall123456", "chengdonglu210mall");
    }

//    这个测试用例会重置mall210数据库，所以比较危险，请开发者注意
//    @Test
    public void testLoad() {
        File file = new File("test.sql");
        DbUtil.load(file, "chengdonglu210mall", "chengdonglu210mall123456", "chengdonglu210mall");
    }
}
