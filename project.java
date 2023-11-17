 public Passengers getPassenger(int n)
    {
                Passengers ps1=new Passengers();

        try{
            String q="select * from record where tn=?";
        PreparedStatement pstmt  =con.prepareStatement(q);
        pstmt.setInt(1,n);
    ResultSet rs =pstmt.executeQuery();
    
       if(rs.next())
       {
           ps1.setPname(rs.getString(1));
           ps1.setAge(rs.getInt(2));
           ps1.setContact(rs.getString(3));
           ps1.setEmail(rs.getString(4));
           ps1.setGender(rs.getString(6));
           ps1.setSource(rs.getString(7));
         ps1.setDestination(rs.getString(8));
         ps1.setFlight_no(rs.getInt(9));
         ps1.setTravel_class(rs.getString(10));
         ps1.setTravelDate(rs.getString(11));
         
          

          
       }
        
    }
         catch(Exception e)
    {
        e.printStackTrace();
    }
        return ps1;
        
    }