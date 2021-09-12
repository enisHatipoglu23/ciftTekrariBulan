public class CiftTekrarBulan {
    static boolean isHas(int[] arr, int value){
        for (int i : arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,4,2,8,6,8};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++){
            for (int j = 0; i < list.length; j++)
                if (i != j) if ((i % 2 == 0) && (i % 2 == 0)) if (list[i] == list[j]) {
                    if (!isHas(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
        }
        for (int deger : duplicate){
            if (deger != 0){
                System.out.println(deger);
            }
        }

    }
}
