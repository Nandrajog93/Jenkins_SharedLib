// Define function
def call(String ProjectName, String ImageTag, String DockerHubUser){
   docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} .
}
