class Money {
  final int value;
  
  Money(int value){
    this.value = value;
  }

  Money add( Money money){
    int newAmount = this.value + money.value;
    return new Money(newAmount);
  }

    Money minus( Money money){
    int newAmount = this.value - money.value;
    return new Money(newAmount);
  }
}