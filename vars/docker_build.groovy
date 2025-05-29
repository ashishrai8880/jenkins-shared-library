def call(String image){
  echo "This is building the code"
  sh "whoami"
  sh "docker build -t ${image} ."
}
