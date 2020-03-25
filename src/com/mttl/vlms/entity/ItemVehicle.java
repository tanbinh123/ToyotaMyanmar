package com.mttl.vlms.entity;

import java.util.Date;

public class ItemVehicle {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_vehicle.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_vehicle.vehicle_id
     *
     * @mbggenerated
     */
    private Integer vehicleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_vehicle.item_id
     *
     * @mbggenerated
     */
    private Integer itemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_vehicle.tasked_date
     *
     * @mbggenerated
     */
    private Date taskedDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_vehicle.id
     *
     * @return the value of item_vehicle.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_vehicle.id
     *
     * @param id the value for item_vehicle.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_vehicle.vehicle_id
     *
     * @return the value of item_vehicle.vehicle_id
     *
     * @mbggenerated
     */
    public Integer getVehicleId() {
        return vehicleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_vehicle.vehicle_id
     *
     * @param vehicleId the value for item_vehicle.vehicle_id
     *
     * @mbggenerated
     */
    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_vehicle.item_id
     *
     * @return the value of item_vehicle.item_id
     *
     * @mbggenerated
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_vehicle.item_id
     *
     * @param itemId the value for item_vehicle.item_id
     *
     * @mbggenerated
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_vehicle.tasked_date
     *
     * @return the value of item_vehicle.tasked_date
     *
     * @mbggenerated
     */
    public Date getTaskedDate() {
        return taskedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_vehicle.tasked_date
     *
     * @param taskedDate the value for item_vehicle.tasked_date
     *
     * @mbggenerated
     */
    public void setTaskedDate(Date taskedDate) {
        this.taskedDate = taskedDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item_vehicle
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", vehicleId=").append(vehicleId);
        sb.append(", itemId=").append(itemId);
        sb.append(", taskedDate=").append(taskedDate);
        sb.append("]");
        return sb.toString();
    }
}