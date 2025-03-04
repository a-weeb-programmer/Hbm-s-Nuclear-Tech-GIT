package com.hbm.packet;

import api.hbm.energy.IEnergyConsumer;
import api.hbm.energy.IEnergySource;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.tileentity.TileEntity;

public class AuxElectricityPacket implements IMessage {

	int x;
	int y;
	int z;
	long charge;

	public AuxElectricityPacket()
	{
		
	}

	public AuxElectricityPacket(int x, int y, int z, long charge)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.charge = charge;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		x = buf.readInt();
		y = buf.readInt();
		z = buf.readInt();
		charge = buf.readLong();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(x);
		buf.writeInt(y);
		buf.writeInt(z);
		buf.writeLong(charge);
	}

	public static class Handler implements IMessageHandler<AuxElectricityPacket, IMessage> {
		
		@Override
		@SideOnly(Side.CLIENT)
		public IMessage onMessage(AuxElectricityPacket m, MessageContext ctx) {
			try {
			TileEntity te = Minecraft.getMinecraft().theWorld.getTileEntity(m.x, m.y, m.z);

			if (te != null && te instanceof IEnergyConsumer) {
					
				IEnergyConsumer gen = (IEnergyConsumer) te;
				gen.setPower(m.charge);
			} else if (te != null && te instanceof IEnergySource) {
					
				IEnergySource gen = (IEnergySource) te;
				gen.setSPower(m.charge);
			}
			} catch (Exception x) { }
			return null;
		}
	}
}
