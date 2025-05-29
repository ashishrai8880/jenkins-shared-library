
def call( String image ){
  echo "This is pushing the image to DockerHub"
  withCredentials([
      usernamePassword(
          'credentialsId':"dockerHubCred",
          passwordVariable:"dockerHubPass",
          usernameVariable:"dockerHubUser"
      )
  ])
  {
      sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
      sh "docker image tag ${image} ${env.dockerHubUser}/${image}"
      sh "docker push  ${env.dockerHubUser}/${image}"
  }
}
