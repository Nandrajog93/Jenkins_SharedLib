def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]) {
       "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
   "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
