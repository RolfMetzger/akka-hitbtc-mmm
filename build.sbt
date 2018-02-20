name := "akka-hitbtc-mmm"

version := "0.1"

scalaVersion := "2.12.4"

lazy val akkaHttpVersion = "10.1.0-RC2"
lazy val akkaVersion = "2.5.9"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http"            % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-xml"        % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-stream"          % akkaVersion,
  "com.typesafe.play" %% "play-json" % "2.6.7",
  "com.typesafe.play" %% "play" % "2.6.7",
  "javax.inject" % "javax.inject" % "1",
  "com.neovisionaries" % "nv-websocket-client" % "2.3",
  "io.vertx" %% "vertx-lang-scala" % "3.5.0",
  "redis.clients" % "jedis" % "2.9.0",
  "com.beachape.filemanagement" %% "schwatcher" % "0.3.2",
  "com.typesafe.akka" %% "akka-http-testkit"    % akkaHttpVersion % Test,
  "com.typesafe.akka" %% "akka-testkit"         % akkaVersion     % Test,
  "com.typesafe.akka" %% "akka-stream-testkit"  % akkaVersion     % Test,
  "org.scalatest"     %% "scalatest"            % "3.0.1"         % Test
)