%module definiciones

#ifndef PCL_FILTERS_APPROXIMATE_VOXEL_GRID_MAP_H_
#define PCL_FILTERS_APPROXIMATE_VOXEL_GRID_MAP_H_

%{
#include <pcl/filters/boost.h>
#include <pcl/filters/filter.h>
%}

namespace pcl
{
	struct Prueba
	{
		Prueba ();
	};
}

#ifdef PCL_NO_PRECOMPILE
%{
#include <pcl/filters/impl/approximate_voxel_grid.hpp>
%}
#endif

#endif
