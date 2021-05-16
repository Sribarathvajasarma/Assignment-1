object totalcost extends App{
  def totalcoverprice(a:Int)=a*24.95;
  def discount(b:Int)=b*24.95*0.4;
  def finalcoverprice(c:Int)= totalcoverprice(c)-discount(c)
  def shippingcost(y:Int)=if(y<50){y*3.0} else{50*3.0+(y-50)*0.75};
  def findtotal(x:Int)=finalcoverprice(x)+shippingcost(x);

  printf("%.2f\n",findtotal(60));
  
} 

