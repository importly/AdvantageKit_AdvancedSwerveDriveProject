package frc.robot.subsystems.drive;

public class GyroIONavX implements GyroIO {
  //  public static NavX navX;
  //  private final StatusSignal<Double> yaw = new StatusSignal<Double>((double) navX.getYaw());
  //  private final Queue<Double> yawPositionQueue;
  //  private final StatusSignal<Double> yawVelocity = navX.getAngularVelocityZ();
  //
  //  private static Rotation3d rotation;
  //
  //  public GyroIONavX() {
  //    System.out.println("[Init] Creating NavX");
  //
  //    switch (Constants.getRobot()) {
  //      case ROBOT_2023C:
  //      case ROBOT_2023P:
  //        navX = new NavX(SPI.Port.kMXP);
  //        break;
  //      default:
  //        throw new RuntimeException("Invalid robot for GyroIOPigeon2");
  //    }
  //
  //    navX.reset();
  //    navX.resetDisplacement();
  //    navX.zeroYaw();
  //  }
  //
  //  public void updateInputs(GyroIOInputs inputs) {
  //    navX.getRawGyroY();
  //    rotation = navX.getRotation3d();
  //    inputs.connected = navX.isConnected();
  //    inputs.rollPositionRad = Units.degreesToRadians(rotation.getX());
  //    inputs.pitchPositionRad = Units.degreesToRadians(rotation.getY());
  //    inputs.yawPositionRad = Units.degreesToRadians(rotation.getZ());
  //    inputs.rollVelocityRadPerSec = Units.degreesToRadians(navX.getRawGyroX());
  //    inputs.pitchVelocityRadPerSec = Units.degreesToRadians(navX.getRawGyroY());
  //    inputs.yawVelocityRadPerSec = Units.degreesToRadians(navX.getRawGyroZ());
  //
  //    inputs.odometryYawPositions =
  //        yawPositionQueue.stream()
  //            .map((Double value) -> Rotation2d.fromDegrees(value))
  //            .toArray(Rotation2d[]::new);
  //    yawPositionQueue.clear();
  //  }
}
