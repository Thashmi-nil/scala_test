object totalWholesaleCost extends App{
  //var price : Double = 24.95;
  def calculateDiscount(x:Int):Double ={
    var newprice : Double = 0;
    newprice=x*(24.95-(24.95*0.4));
    return newprice;
  }

  def calculateShippingCost(x:Int):Double={
    var amount : Double = 0;
    
    if(x<=50){
      amount=3;
    }else{
      amount=3+(0.75*(x-50));
    }
    return amount;
  }

  def total(x:Int)=calculateDiscount(x)+calculateShippingCost(x);
  //println(calculateDiscount(60))
  //println(calculateShippingCost(60))
  println(total(60));

}
