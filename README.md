# Java 21

![{878413F2-264D-4E01-B510-88D9785874CB}](https://github.com/user-attachments/assets/9c375705-907a-40f6-a2c2-8cd8c8933e66)

## Prometheus
### prometheus.yml config
```
global:
  scrape_interval: 15s

scrape_configs:
  - job_name: 'spring-actuator'
    metrics_path: '/actuator/prometheus'
    static_configs:
      - targets: ['hostname.local:8081']
```

### Start command
```
sudo docker run -d --name=prometheus -p 127.0.0.1:9090:9090 -v /home/burymydeadhoreses/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus
```

## Grafana

### Start command
```
sudo docker run -d -p 127.0.0.1:3000:3000 --name=grafana grafana/grafana
```

## Create network and add applications to it

### Create network
```
sudo docker network create DockerNetwork
```

### Add Prometheus
```
sudo docker network connect DockerNetwork prometheus
```

### Add Grafana
```
sudo docker network connect DockerNetwork grafana
```

## Reveal ip adresses
```
sudo docker network inspect DockerNetwork
```

![{409BFB78-DD5D-46FF-AE67-A38C7FF897FF}](https://github.com/user-attachments/assets/08a11287-e2cc-4ee0-868c-b0df3a764267)


