class Money {
  final int value;
  
  Money(int value){
    this.value = value;
  }

  Money add( Money m){
    int newAmount = this.value + m.value;
    return new Money(newAmount);
  }

    Money minus( Money m){
    int newAmount = this.value - m.value;
    return new Money(newAmount);
  }
}