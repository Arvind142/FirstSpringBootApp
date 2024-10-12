FROM openjdk:21-slim
RUN mkdir app
WORKDIR /app
COPY target/ app/
CMD [ "java","-jar","myApp.jar" ]