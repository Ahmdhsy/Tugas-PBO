public class Sorting {

    // Selection Sort untuk mengurutkan array objek Comparable dalam urutan naik
    public static void selectionSort(Comparable[] list) {
        int min;
        Comparable temp;

        for (int index = 0; index < list.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;

            // Tukar elemen
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    // Insertion Sort untuk mengurutkan array objek Comparable dalam urutan menurun
    public static void insertionSort(Comparable[] list) {
        for (int index = 1; index < list.length; index++) {
            Comparable key = list[index];
            int position = index;

            // Geser elemen yang lebih kecil dari key ke kanan
            while (position > 0 && list[position - 1].compareTo(key) < 0) {
                list[position] = list[position - 1];
                position--;
            }

            list[position] = key;
        }
    }
}
