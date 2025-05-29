def call(String url , String branch){
  echo "This is cloning the code"
  // git url: url , branch: branch     This is also a way
  git url: "${url}", branch: "${branch}"
  echo "Code Clone Successfully"
}
