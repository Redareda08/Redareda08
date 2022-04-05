package esiea.tools.vector3d;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestVector3d {
	@Test
	void TestVector3dConstructors() {
		Entity3d e= new Entity3d();
		Vector3d v = new Vector3d(1.5,1.8,4.2);
		Vector3d v1 = new Vector3d();
		Vector3d v2 = new Vector3d (e);

		assertEquals(1.5,v.x);
		assertEquals(1.8,v.y);
		assertEquals(4.2,v.z);
		assertEquals(0.0,v2.x);
		assertEquals(0.0,v2.y);
		assertEquals(0.0,v2.z);


	}

	/* example
	   v1 x v2 = | i  j   k |
	             | 3  4   8 |
	             | 7  2   1 |
	           = i(4*1-2*8)-j(3*1-7*8)+k(3*2-4*7)
	    see also https://mathinsight.org/cross_product
	 */
	@Test
	void TestVector3dCross() {

		Vector3d vector = new Vector3d();
		Vector3d v1 = new Vector3d(1.5,1.8,4.2);
		Vector3d v2 = new Vector3d(1.4,6.6,4.8);
		vector.cross(v1,v2);
		//assertEquals(vector.cross(v1,v2),29.304);
		assertEquals(-19.08,vector.x);
		assertEquals(-1.3199999999999994,vector.y);
		assertEquals(7.379999999999999,vector.z);

	}

	/* https://mathinsight.org/dot_product
	 */
	@Test
	void TestVector3dDotProduct() {
		Vector3d v= new Vector3d(3.0,3.0,3.0);
		Vector3d v1 = new Vector3d(2,2,2);
		assertEquals(18.0,v.dot(v1));
	}

	@Test
	void TestVector3dLength() {
		Vector3d v = new Vector3d(1,3,5);
		assertEquals(3.0,v.length());
	}

}
