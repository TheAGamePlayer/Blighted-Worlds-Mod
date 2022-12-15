package dev.theagameplayer.blightedworlds.registries;

import dev.theagameplayer.blightedworlds.BlightedWorldsMod;
import dev.theagameplayer.blightedworlds.world.level.levelgen.structure.structures.InfernalNetherFortressPieces;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class BWStructurePieceTypes {
	public static final DeferredRegister<StructurePieceType> STRUCTURE_PIECE_TYPES = DeferredRegister.create(Registries.STRUCTURE_PIECE, BlightedWorldsMod.MODID);
	
	//Infernal Fortress
	public static final RegistryObject<StructurePieceType.ContextlessType> INF_BRIDGE_END_FILLER = STRUCTURE_PIECE_TYPES.register("inf_bridge_end_filler", () -> InfernalNetherFortressPieces.BridgeEndFiller::new);
	public static final RegistryObject<StructurePieceType.ContextlessType> INF_BRIDGE_STRAIGHT1 = STRUCTURE_PIECE_TYPES.register("inf_bridge_straight1", () -> InfernalNetherFortressPieces.BridgeStraight1::new);
	public static final RegistryObject<StructurePieceType.ContextlessType> INF_BRIDGE_STRAIGHT2 = STRUCTURE_PIECE_TYPES.register("inf_bridge_straight2", () -> InfernalNetherFortressPieces.BridgeStraight2::new);
	public static final RegistryObject<StructurePieceType.ContextlessType> INF_BRIDGE_STRAIGHT3 = STRUCTURE_PIECE_TYPES.register("inf_bridge_straight3", () -> InfernalNetherFortressPieces.BridgeStraight3::new);
	public static final RegistryObject<StructurePieceType.ContextlessType> INF_BRIDGE_CROSSING1 = STRUCTURE_PIECE_TYPES.register("inf_bridge_crossing1", () -> InfernalNetherFortressPieces.BridgeCrossing1::new);
	public static final RegistryObject<StructurePieceType.ContextlessType> INF_BRIDGE_CROSSING2 = STRUCTURE_PIECE_TYPES.register("inf_bridge_crossing2", () -> InfernalNetherFortressPieces.BridgeCrossing2::new);
	public static final RegistryObject<StructurePieceType.ContextlessType> INF_BRIDGE_CROSSING3 = STRUCTURE_PIECE_TYPES.register("inf_bridge_crossing3", () -> InfernalNetherFortressPieces.BridgeCrossing3::new);
	public static final RegistryObject<StructurePieceType.ContextlessType> INF_ROOM_CROSSING = STRUCTURE_PIECE_TYPES.register("inf_room_crossing", () -> InfernalNetherFortressPieces.RoomCrossing::new);
	public static final RegistryObject<StructurePieceType.ContextlessType> INF_BIG_ROOM_CROSSING = STRUCTURE_PIECE_TYPES.register("inf_big_room_crossing", () -> InfernalNetherFortressPieces.BigRoomCrossing::new);
	public static final RegistryObject<StructurePieceType.ContextlessType> INF_CASTLE_ENTRANCE = STRUCTURE_PIECE_TYPES.register("inf_castle_entrance", () -> InfernalNetherFortressPieces.CastleEntrance::new);
	public static final RegistryObject<StructurePieceType.ContextlessType> INF_STAIRS_ROOM = STRUCTURE_PIECE_TYPES.register("inf_stairs_room", () -> InfernalNetherFortressPieces.StairsRoom::new);
	public static final RegistryObject<StructurePieceType.ContextlessType> INF_MONSTER_THRONE = STRUCTURE_PIECE_TYPES.register("inf_monster_throne", () -> InfernalNetherFortressPieces.MonsterThrone::new);
	public static final RegistryObject<StructurePieceType.ContextlessType> INF_GRAND_MONSTER_THRONE = STRUCTURE_PIECE_TYPES.register("inf_grand_monster_throne", () -> InfernalNetherFortressPieces.GrandMonsterThrone::new);
	public static final RegistryObject<StructurePieceType.ContextlessType> INF_CASTLE_SMALL_CORRIDOR_LEFT_TURN = STRUCTURE_PIECE_TYPES.register("inf_castle_small_corridor_left_turn", () -> InfernalNetherFortressPieces.CastleSmallCorridorLeftTurnPiece::new);
	public static final RegistryObject<StructurePieceType.ContextlessType> INF_CASTLE_SMALL_CORRIDOR_RIGHT_TURN = STRUCTURE_PIECE_TYPES.register("inf_castle_small_corridor_right_turn", () -> InfernalNetherFortressPieces.CastleSmallCorridorRightTurnPiece::new);
	public static final RegistryObject<StructurePieceType.ContextlessType> INF_CASTLE_CORRIDOR_STAIRS = STRUCTURE_PIECE_TYPES.register("inf_castle_corridor_stairs", () -> InfernalNetherFortressPieces.CastleCorridorStairsPiece::new);
	public static final RegistryObject<StructurePieceType.ContextlessType> INF_CASTLE_CORRIDOR_T_BALCONY = STRUCTURE_PIECE_TYPES.register("inf_castle_corridor_t_balcony", () -> InfernalNetherFortressPieces.CastleCorridorTBalconyPiece::new);
	public static final RegistryObject<StructurePieceType.ContextlessType> INF_CASTLE_SMALL_CORRIDOR = STRUCTURE_PIECE_TYPES.register("inf_castle_small_corridor", () -> InfernalNetherFortressPieces.CastleSmallCorridorPiece::new);
	public static final RegistryObject<StructurePieceType.ContextlessType> INF_CASTLE_STALK_ROOM = STRUCTURE_PIECE_TYPES.register("inf_castle_stalk_room", () -> InfernalNetherFortressPieces.CastleStalkRoom::new);
	public static final RegistryObject<StructurePieceType.ContextlessType> INF_START = STRUCTURE_PIECE_TYPES.register("inf_start", () -> InfernalNetherFortressPieces.StartPiece::new);
}
