package Deerlet.uti;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Deerlet-7 on 2020/7/28 12:12
 */
public class DBUtilTest extends TestCase {
    @Test
    public void testGetConnection() {
        Assert.assertNotNull(DBUtil.getConnection());
    }
}