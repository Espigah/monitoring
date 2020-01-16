docker build -t=fabriciogoncalves/elkbeat-react-web . --no-cache


docker build -f dockerfile-build.yml  -t=fabriciogoncalves/elkbeat-react-web-build .

docker build -f dockerfile-dev.yml  -t=fabriciogoncalves/elkbeat-react-web-dev .
