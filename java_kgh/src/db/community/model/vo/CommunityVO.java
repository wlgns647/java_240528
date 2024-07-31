package db.community.model.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CommunityVO {

	private int co_num;
	private String co_name;
	@Override
	public String toString() {
		return co_num + ". " + co_name;
	}
	
	
}
