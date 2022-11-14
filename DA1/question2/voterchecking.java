public class voterchecking {
    int id;
    Boolean cons;
    public voterchecking(int i,Boolean c){
        id=i;
        cons=c;
        if (id<10001 || id>20002||cons==false){
            try{
                throw new votingrule(id,cons);
            }
            catch(votingrule e){};
        }
        else{
            System.out.println("valid data");
        }    
        }
}
