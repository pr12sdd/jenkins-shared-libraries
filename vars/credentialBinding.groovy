def call(){
  withCredentials([usernamePassword('credentialsId':"DockerHubCred",usernameVariable:"dockerHubUser",passwordvariable:"dockerHubPass")]){
    sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
    sh "docker image tag updated-notesapp:latest ${env.dockerHubUser}/updated-notesapp:latest"
    sh "docker push ${env.dockerHubUser}/updated-notesapp:latest"
  }
