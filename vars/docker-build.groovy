def call(String appName){
  echo "This is building the code"
  sh "whoami"
  sh "docker build -t ${appName} ."
}
