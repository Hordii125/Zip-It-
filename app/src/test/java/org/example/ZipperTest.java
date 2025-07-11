package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
public class ZipperTest {
    @Test
    public void testZipWithEqualSizeLists() {
        ListZipper zipper = new ListZipper();
        List<Integer> list1 = List.of(1, 3, 5);
        List<Integer> list2 = List.of(2, 4, 6);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6);
        assertEquals(expected, zipper.zip(list1, list2));
    }

    @Test
    public void testZipWithDifferentSizeLists() {
        ListZipper zipper = new ListZipper();
        List<Integer> list1 = List.of(1, 3, 5, 7);
        List<Integer> list2 = List.of(2, 4);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 7);
        assertEquals(expected, zipper.zip(list1, list2));
    }

    @Test 
    public void testZipperWithStrings() {
        ListZipper zipper = new ListZipper();
        List<String> list1 = List.of("a", "c", "e");
        List<String> list2 = List.of("b", "d");
        List<String> expected = List.of("a", "b", "c", "d", "e");
        assertEquals(expected, zipper.zip(list1, list2));
    }
}
