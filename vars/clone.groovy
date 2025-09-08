def call(String url,String branch){
   echo "In this stage we are cloning the code"
   git url:"${url}",branch:"${branch}"
   echo "Cloning the code successful"
}
