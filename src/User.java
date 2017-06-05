
// -----------------------------
// Author : Achmad Fahrurrozi M.
// -----------------------------

import java.util.List;

public class User {

  private String username;
  private String email;
  private String name;
  private int nRepo;
  private int nFollower;
  private List<Repository> repoList;

  public User(String username, String email, String name, int nRepo, int nFollower, List<Repository> repoList) {
    this.username = username;
    this.email = email;
    this.name = name;
    this.nRepo = nRepo;
    this.nFollower = nFollower;
    this.repoList = repoList;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getnRepo() {
    return nRepo;
  }

  public void setnRepo(int nRepo) {
    this.nRepo = nRepo;
  }

  public int getnFollower() {
    return nFollower;
  }

  public void setnFollower(int nFollower) {
    this.nFollower = nFollower;
  }

  public List<Repository> getRepoList() {
    return repoList;
  }

  public void setRepoList(List<Repository> repoList) {
    this.repoList = repoList;
  }
}