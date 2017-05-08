package com.ksc.network.vpc.model.VpcPeeringConnection;

import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of ModifyVpcPeeringConnection.
 * </p>
 */
@ToString
public class ModifyVpcPeeringConnectionResult implements Serializable, Cloneable {

    private String RequestId;

    private VpcPeeringConnection VpcPeeringConnection;

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public com.ksc.network.vpc.model.VpcPeeringConnection.VpcPeeringConnection getVpcPeeringConnection() {
        return VpcPeeringConnection;
    }

    public void setVpcPeeringConnection(com.ksc.network.vpc.model.VpcPeeringConnection.VpcPeeringConnection vpcPeeringConnection) {
        VpcPeeringConnection = vpcPeeringConnection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModifyVpcPeeringConnectionResult that = (ModifyVpcPeeringConnectionResult) o;

        if (!RequestId.equals(that.RequestId)) return false;
        return VpcPeeringConnection.equals(that.VpcPeeringConnection);
    }

    @Override
    public int hashCode() {
        int result = RequestId.hashCode();
        result = 31 * result + VpcPeeringConnection.hashCode();
        return result;
    }

    @Override
    public ModifyVpcPeeringConnectionResult clone() {
        try {
            return (ModifyVpcPeeringConnectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }

}