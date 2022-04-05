package esiea.tools.vector3d;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.*;
public class TestEntity3d {

    @Test
    void TestEntity3dVoidConstructor() {
        Entity3d e = new Entity3d();
        assertEquals(0.0,e.x);
        assertEquals(0.0,e.y);
        assertEquals(0.0,e.z);
    }

    @Test
    void TestEntity3dCopyConstructor() {
        Entity3d e = new Entity3d(2.0,2.0,2.0);
        Entity3d e1 = new Entity3d(e);
        assertEquals(2.0,e1.x);
        assertEquals(2.0,e1.y);
        assertEquals(2.0,e1.z);
    }
    @Test
    void TestEntity3dConstructor() {
        Entity3d e = new Entity3d(2.0,2.0,2.0);
        assertEquals(2.0,e.x);
        assertEquals(2.0,e.y);
        assertEquals(2.0,e.z);
    }
    @Test
    void TestToString() {
      Entity3d e = new Entity3d(2.0,2.0,2.0);
      assertTrue(e.toString().equals("(" + e.x + "," + e.y + "," + e.z + ")"));
    }


    @Test
    void TestScale()
    {
       Entity3d e = new Entity3d(2.0,2.0,2.0);
       e.scale(2.0);
       assertEquals(4.0,e.x);
        assertEquals(4.0,e.y);
        assertEquals(4.0,e.z);
    }

    @Test
    void TestScaleEntity() {
        Entity3d e = new Entity3d();
        Entity3d e1 = new Entity3d(2.0,2.0,2.0);
        e.scale(2.0,e1);
        assertEquals(4.0,e.x);
        assertEquals(4.0,e.y);
        assertEquals(4.0,e.z);

    }

    @Test
    void TestAdd() {
        Entity3d e = new Entity3d();
        Entity3d e1 = new Entity3d(2.0,2.0,2.0);
        e.add(e1);
        assertEquals(2.0,e.x);
        assertEquals(2.0,e.y);
        assertEquals(2.0,e.z);
    }

    @Test
    void TestHashCode() {
        Entity3d e = new Entity3d(2.0,2.0,2.0);
        long bits = 1L;
        bits = 31L * bits + VectorMathsUtil.doubleToLongBits(e.x);
        bits = 31L * bits + VectorMathsUtil.doubleToLongBits(e.y);
        bits = 31L * bits + VectorMathsUtil.doubleToLongBits(e.z);
        int a = e.hashCode();
        assertEquals((int) (bits ^ (bits >> 32)),a);

    }

    @Test
    void TestEquals() {
        Entity3d e = new Entity3d(2.0,2.0,2.0);
        Entity3d e1 = new Entity3d(2.0,2.0,2.0);
        assertTrue(e.equals(e1));
        assertFalse(e.equals(null));
     }

    @Test
    void TestEpsilonEquals() {
        Entity3d e = new Entity3d(2.0,2.0,2.0);
        Entity3d e1 = new Entity3d(2.0,2.0,2.0);
        assertTrue(e.epsilonEquals(e,3.0));

    }
}