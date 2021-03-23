import microsites.ConfigYml

micrositeName             := "ghpages-name"
micrositeDescription      := "a description goes here"
micrositeAuthor           := "Jostein Gogstad"
micrositeGithubOwner      := "jgogstad"
micrositeGithubRepo       := "ghpagestest"
//micrositeBaseUrl          := "/ghpagestest"
//micrositeDocumentationUrl := "/ghpagestest/docs/"
aggregate in doc := true


micrositeConfigYaml := ConfigYml(
  yamlCustomProperties = Map(
    "repoVersion"       -> version.value,
    "scalaVersions"     -> crossScalaVersions.value.flatMap(CrossVersion.partialVersion).map(_._2).mkString("2.", "/", "") // 2.11/12
  )
)