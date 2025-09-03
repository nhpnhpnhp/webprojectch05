# Tomcat 9 + JDK 17 (khớp môi trường local)
FROM tomcat:9.0-jdk17-temurin

# Dọn app mẫu cho sạch
RUN rm -rf /usr/local/tomcat/webapps/*

# Deploy WAR của bạn
# - Dùng ROOT.war => context path = "/"
#   (vào thẳng http://localhost:8080/)
COPY webproject.war /usr/local/tomcat/webapps/ROOT.war

# (Tuỳ chọn) Healthcheck
HEALTHCHECK --interval=30s --timeout=5s --start-period=20s --retries=3 \
  CMD wget -qO- http://127.0.0.1:8080/ || exit 1

EXPOSE 8080
CMD ["catalina.sh", "run"]

