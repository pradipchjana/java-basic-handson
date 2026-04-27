class Money {
  int value;
  
  Money(int value){
    this.value = value;
  }

  Money add( Money m){
    int addResult = this.value + m.value;
    return new Money(addResult);
  }

    Money minus( Money m){
    int addResult = this.value - m.value;
    return new Money(addResult);
  }
}