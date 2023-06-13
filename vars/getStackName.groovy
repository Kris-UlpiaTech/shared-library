def call() {
  def branch = env.GIT_BRANCH.split('/')
  return branch[1]
}