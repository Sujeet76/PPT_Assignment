class ElementAppearsTwice {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3,1};
    System.out.println(appearsAtLeastTwice(arr));
  }

  // function
  // function which checks the duplicate
  public static Boolean appearsAtLeastTwice(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j])
          return true;
      }
    }
    return false;
  }
}