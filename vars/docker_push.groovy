
def call( String image , String username , String password ){
  echo "This is pushing the image to DockerHub"
  withCredentials([
      usernamePassword(
          'credentialsId':"dockerHubCred",
          passwordVariable:"dockerHubPass",
          usernameVariable:"dockerHubUser"
      )
  ])
  {
      sh "docker login -u ${username} -p ${password}"
      sh "docker image tag ${image} ${username}/${image}"
      sh "docker push ${username}/${image}"
  }
}
