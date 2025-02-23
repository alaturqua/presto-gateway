package com.lyft.data.gateway.ha.config;

import com.lyft.data.gateway.ha.clustermonitor.ActiveClusterMonitor;
import lombok.Data;

@Data
public class MonitorConfiguration {
  private int connectionTimeout = ActiveClusterMonitor.BACKEND_CONNECT_TIMEOUT_SECONDS;
  private int taskDelayMin = ActiveClusterMonitor.MONITOR_TASK_DELAY_MIN;
  private String jwt;
  private boolean useJwtAuth = false;
  private int jdbcPort = 443;
  private boolean jdbcUseSsl;
  private String trinoUsername;
  private String trinoPassword;
}
