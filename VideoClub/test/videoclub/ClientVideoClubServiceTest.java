/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

import org.easymock.EasyMock; 
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 56978
 */
public class ClientVideoClubServiceTest extends TestCase {
    private IVideoClubService remoteVideoClubServiceMock;
    private IVideo Video28Mock;
    
   
    protected void setUp() throws Exception {
        super.setUp();
        Video28Mock = EasyMock.createMock(IVideo.class);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getVideo method, of class ClientVideoClubService.
     */
    @Test
    public void testGetVideo() {
    }
    
}
