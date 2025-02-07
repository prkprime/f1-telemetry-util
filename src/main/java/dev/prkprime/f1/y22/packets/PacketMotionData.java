package dev.prkprime.f1.y22.packets;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder(access = AccessLevel.PRIVATE, setterPrefix = "set")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PacketMotionData {
    private PacketHeader header;
    private CarMotionData[] carMotionData;
    private float[] suspensionPosition;
    private float[] suspensionVelocity;
    private float[] suspensionAcceleration;
    private float[] wheelSpeed;
    private float[] wheelSlip;
    private float localVelocityX;
    private float localVelocityY;
    private float localVelocityZ;
    private float angularVelocityX;
    private float angularVelocityY;
    private float angularVelocityZ;
    private float angularAccelerationX;
    private float angularAccelerationY;
    private float angularAccelerationZ;
    private float frontWheelsAngle;
}

