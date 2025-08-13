### Docs References: 
- Pulling image: https://hub.docker.com/_/mysql

```shell
docker run --name some-mysql -e MYSQL_ROOT_PASSWORD=mysql -d mysql:9.4.0
```

```shell
docker run -it --network some-network --rm mysql mysql -hsome-mysql -uexample-user -p

# user is root, password is mysql. 

```