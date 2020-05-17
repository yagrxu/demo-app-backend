docker login --username=$REPO_USER $REPO_URL --password=$REPO_PASSWORD
docker build . -t demo-backend
export IMAGE_TAG_ID=`docker image inspect demo-backend |jq '.[0].Id' | cut -c9-21`
docker tag $IMAGE_TAG_ID $REPO_URL/cloud-native-demo/backend-demo:latest
docker push $REPO_URL/cloud-native-demo/backend-demo:latest