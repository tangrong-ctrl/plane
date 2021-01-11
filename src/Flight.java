public class Flight {
    private String id;
    private String planeType;//飞机类型
    private String departureAire;//航空部门
    private String destinationcity;//到达城市
    private String getDepartureTime;//起飞时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getDepartureAire() {
        return departureAire;
    }

    public void setDepartureAire(String departureAire) {
        this.departureAire = departureAire;
    }

    public String getDestinationcity() {
        return destinationcity;
    }

    public void setDestinationcity(String destinationcity) {
        this.destinationcity = destinationcity;
    }

    public String getGetDepartureTime() {
        return getDepartureTime;
    }

    public void setGetDepartureTime(String getDepartureTime) {
        this.getDepartureTime = getDepartureTime;
    }
}
