package intlist_oop2021;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class intlist_test {

	@Test
	void test() {
		intList myIntList = new intList(new int[] {10,20,30});
		assertArrayEquals(new int[]{10,20,30}, myIntList.getElements());
	}

}
