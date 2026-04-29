void bincon() {
    int a =2562;
    if(a<0)
      return;
    String bit = "";
    int msb = (int) (Math.log(a) / Math.log(2));
    int i, b = a, c = msb;
    for (i = msb; i >= 0; i--) {

      if (b >= Math.powExact(2, c)) {

        bit += '1';
        b = b - Math.powExact(2, c);

      } else
        bit += '0';
      c--;
    }
    System.out.println('\n' + bit);
  }
